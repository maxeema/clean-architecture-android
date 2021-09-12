package maxeem.america.majesticreader.framework.db

import maxeem.america.majesticreader.data.OpenDocumentDataSource
import maxeem.america.majesticreader.domain.Document

class InMemoryOpenDocumentDataSource : OpenDocumentDataSource {

  private var openDocument: Document = Document.EMPTY

  override fun setOpenDocument(document: Document) {
    openDocument = document
  }

  override fun getOpenDocument() = openDocument
}