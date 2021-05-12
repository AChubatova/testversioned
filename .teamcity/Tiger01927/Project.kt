package Tiger01927

import Tiger01927.buildTypes.*
import Tiger01927.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01927")
    name = "Tiger01927"

    vcsRoot(Tiger01927_cVCSroot)

    buildType(Tiger01927_Hi3)
    buildType(Tiger01927_Hi2)
    buildType(Tiger01927_Hi1)
    buildType(Tiger01927_Hi0)
})
