package maxeem.america.majesticreader.data

import maxeem.america.majesticreader.domain.Bookmark
import maxeem.america.majesticreader.domain.Document

interface BookmarkDataSource {

  suspend fun add(document: Document, bookmark: Bookmark)

  suspend fun read(document: Document): List<Bookmark>

  suspend fun remove(document: Document, bookmark: Bookmark)
}