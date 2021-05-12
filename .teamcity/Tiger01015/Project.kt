package Tiger01015

import Tiger01015.buildTypes.*
import Tiger01015.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01015")
    name = "Tiger01015"

    vcsRoot(Tiger01015_cVCSroot)

    buildType(Tiger01015_Hi2)
    buildType(Tiger01015_Hi3)
    buildType(Tiger01015_Hi0)
    buildType(Tiger01015_Hi1)
})
