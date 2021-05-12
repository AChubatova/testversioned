package Tiger01123

import Tiger01123.buildTypes.*
import Tiger01123.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01123")
    name = "Tiger01123"

    vcsRoot(Tiger01123_cVCSroot)

    buildType(Tiger01123_Hi1)
    buildType(Tiger01123_Hi0)
    buildType(Tiger01123_Hi3)
    buildType(Tiger01123_Hi2)
})
