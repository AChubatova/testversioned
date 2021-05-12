package Tiger01117

import Tiger01117.buildTypes.*
import Tiger01117.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01117")
    name = "Tiger01117"

    vcsRoot(Tiger01117_cVCSroot)

    buildType(Tiger01117_Hi1)
    buildType(Tiger01117_Hi2)
    buildType(Tiger01117_Hi3)
    buildType(Tiger01117_Hi0)
})
