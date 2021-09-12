package maxeem.america.majesticreader.interactors

import maxeem.america.majesticreader.data.BookmarkRepository
import maxeem.america.majesticreader.domain.Document

class GetBookmarks(private val bookmarkRepository: BookmarkRepository) {

  suspend operator fun invoke(document: Document) = bookmarkRepository.getBookmarks(document)
}