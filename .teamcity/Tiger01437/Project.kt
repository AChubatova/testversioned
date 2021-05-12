package Tiger01437

import Tiger01437.buildTypes.*
import Tiger01437.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01437")
    name = "Tiger01437"

    vcsRoot(Tiger01437_cVCSroot)

    buildType(Tiger01437_Hi1)
    buildType(Tiger01437_Hi0)
    buildType(Tiger01437_Hi3)
    buildType(Tiger01437_Hi2)
})
