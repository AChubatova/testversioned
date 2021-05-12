package Tiger01338

import Tiger01338.buildTypes.*
import Tiger01338.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01338")
    name = "Tiger01338"

    vcsRoot(Tiger01338_cVCSroot)

    buildType(Tiger01338_Hi1)
    buildType(Tiger01338_Hi0)
    buildType(Tiger01338_Hi3)
    buildType(Tiger01338_Hi2)
})
