package maxeem.america.majesticreader.data

import maxeem.america.majesticreader.domain.Document

interface DocumentDataSource {

  suspend fun add(document: Document)

  suspend fun readAll(): List<Document>

  suspend fun remove(document: Document)
}