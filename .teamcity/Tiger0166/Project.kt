package Tiger0166

import Tiger0166.buildTypes.*
import Tiger0166.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0166")
    name = "Tiger0166"

    vcsRoot(Tiger0166_cVCSroot)

    buildType(Tiger0166_Hi2)
    buildType(Tiger0166_Hi3)
    buildType(Tiger0166_Hi0)
    buildType(Tiger0166_Hi1)
})
