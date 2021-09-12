package maxeem.america.majesticreader.framework

import android.content.Context
import maxeem.america.majesticreader.data.DocumentDataSource
import maxeem.america.majesticreader.domain.Document
import maxeem.america.majesticreader.framework.db.DocumentEntity
import maxeem.america.majesticreader.framework.db.MajesticReaderDatabase

class RoomDocumentDataSource(val context: Context) : DocumentDataSource {

  private val documentDao = MajesticReaderDatabase.getInstance(context).documentDao()

  override suspend fun add(document: Document) {
    val details = FileUtil.getDocumentDetails(context, document.url)

    return documentDao.addDocument(
        DocumentEntity(document.url, details.name, details.size, details.thumbnail)
    )
  }

  override suspend fun readAll(): List<Document> = documentDao.getDocuments().map {
    Document(
        it.uri,
        it.title,
        it.size,
        it.thumbnailUri
    )
  }

  override suspend fun remove(document: Document) = documentDao.removeDocument(
      DocumentEntity(document.url, document.name, document.size, document.thumbnail)
  )
}