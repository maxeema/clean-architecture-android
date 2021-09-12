package maxeem.america.majesticreader.interactors

import maxeem.america.majesticreader.data.BookmarkRepository
import maxeem.america.majesticreader.domain.Bookmark
import maxeem.america.majesticreader.domain.Document

class RemoveBookmark(private val bookmarksRepository: BookmarkRepository) {
  suspend operator fun invoke(document: Document, bookmark: Bookmark) = bookmarksRepository
      .removeBookmark(document, bookmark)
}