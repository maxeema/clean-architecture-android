package maxeem.america.majesticreader.interactors

import maxeem.america.majesticreader.data.DocumentRepository

class GetDocuments(private val documentRepository: DocumentRepository) {
  suspend operator fun invoke() = documentRepository.getDocuments()
}
