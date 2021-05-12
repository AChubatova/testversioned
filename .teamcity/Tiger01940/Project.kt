package Tiger01940

import Tiger01940.buildTypes.*
import Tiger01940.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01940")
    name = "Tiger01940"

    vcsRoot(Tiger01940_cVCSroot)

    buildType(Tiger01940_Hi3)
    buildType(Tiger01940_Hi1)
    buildType(Tiger01940_Hi2)
    buildType(Tiger01940_Hi0)
})
