package maxeem.america.majesticreader.framework

import android.content.Context
import maxeem.america.majesticreader.data.BookmarkDataSource
import maxeem.america.majesticreader.domain.Bookmark
import maxeem.america.majesticreader.domain.Document
import maxeem.america.majesticreader.framework.db.BookmarkEntity
import maxeem.america.majesticreader.framework.db.MajesticReaderDatabase

class RoomBookmarkDataSource(context: Context) : BookmarkDataSource {

  // 1
  private val bookmarkDao = MajesticReaderDatabase.getInstance(context).bookmarkDao()

  // 2
  override suspend fun add(document: Document, bookmark: Bookmark) =
      bookmarkDao.addBookmark(BookmarkEntity(
          documentUri = document.url,
          page = bookmark.page
      ))

  override suspend fun read(document: Document): List<Bookmark> = bookmarkDao
      .getBookmarks(document.url).map { Bookmark(it.id, it.page) }

  override suspend fun remove(document: Document, bookmark: Bookmark) =
      bookmarkDao.removeBookmark(
          BookmarkEntity(id = bookmark.id, documentUri = document.url, page = bookmark.page)
      )
}