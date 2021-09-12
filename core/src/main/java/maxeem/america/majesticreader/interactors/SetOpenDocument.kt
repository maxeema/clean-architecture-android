package maxeem.america.majesticreader.interactors

import maxeem.america.majesticreader.data.DocumentRepository
import maxeem.america.majesticreader.domain.Document

class SetOpenDocument(private val documentRepository: DocumentRepository) {
  operator fun invoke(document: Document) = documentRepository.setOpenDocument(document)
}