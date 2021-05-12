package Tiger0186

import Tiger0186.buildTypes.*
import Tiger0186.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0186")
    name = "Tiger0186"

    vcsRoot(Tiger0186_cVCSroot)

    buildType(Tiger0186_Hi2)
    buildType(Tiger0186_Hi3)
    buildType(Tiger0186_Hi0)
    buildType(Tiger0186_Hi1)
})
