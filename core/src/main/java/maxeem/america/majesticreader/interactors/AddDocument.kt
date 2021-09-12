package maxeem.america.majesticreader.interactors

import maxeem.america.majesticreader.data.DocumentRepository
import maxeem.america.majesticreader.domain.Document

class AddDocument(private val documentRepository: DocumentRepository) {
  suspend operator fun invoke(document: Document) = documentRepository.addDocument(document)
}
