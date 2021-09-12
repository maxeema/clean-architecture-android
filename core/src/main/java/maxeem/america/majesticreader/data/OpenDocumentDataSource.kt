package maxeem.america.majesticreader.data

import maxeem.america.majesticreader.domain.Document

interface OpenDocumentDataSource {

  fun setOpenDocument(document: Document)

  fun getOpenDocument(): Document
}