package maxeem.america.majesticreader.interactors

import maxeem.america.majesticreader.data.BookmarkRepository
import maxeem.america.majesticreader.domain.Bookmark
import maxeem.america.majesticreader.domain.Document

class AddBookmark(private val bookmarkRepository: BookmarkRepository) {
  suspend operator fun invoke(document: Document, bookmark: Bookmark) =
      bookmarkRepository.addBookmark(document, bookmark)
}