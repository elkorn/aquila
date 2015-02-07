package elkorn.aquila.core.resources

import elkorn.aquila.core.loaders.HttpDownloader

trait HttpDownload[TResult] extends Load[java.net.URL, TResult, HttpDownloader] {
  val address: java.net.URL
}

