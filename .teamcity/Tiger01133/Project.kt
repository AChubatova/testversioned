package Tiger01133

import Tiger01133.buildTypes.*
import Tiger01133.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01133")
    name = "Tiger01133"

    vcsRoot(Tiger01133_cVCSroot)

    buildType(Tiger01133_Hi3)
    buildType(Tiger01133_Hi1)
    buildType(Tiger01133_Hi2)
    buildType(Tiger01133_Hi0)
})
