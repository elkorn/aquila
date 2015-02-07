package elkorn.aquila.core.resources

import elkorn.aquila.core.loaders.HttpDownloader

/**
 * Created by elkorn on 2/6/15.
 */
trait HttpDownload[TResult] extends Load[TResult, HttpDownloader]

