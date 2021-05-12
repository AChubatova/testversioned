package Tiger01236

import Tiger01236.buildTypes.*
import Tiger01236.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01236")
    name = "Tiger01236"

    vcsRoot(Tiger01236_cVCSroot)

    buildType(Tiger01236_Hi3)
    buildType(Tiger01236_Hi1)
    buildType(Tiger01236_Hi2)
    buildType(Tiger01236_Hi0)
})
