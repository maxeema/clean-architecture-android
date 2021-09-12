package maxeem.america.majesticreader.interactors

import maxeem.america.majesticreader.data.DocumentRepository

class GetOpenDocument(private val documentRepository: DocumentRepository) {
  operator fun invoke() = documentRepository.getOpenDocument()
}
