package Tiger01146

import Tiger01146.buildTypes.*
import Tiger01146.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01146")
    name = "Tiger01146"

    vcsRoot(Tiger01146_cVCSroot)

    buildType(Tiger01146_Hi2)
    buildType(Tiger01146_Hi1)
    buildType(Tiger01146_Hi3)
    buildType(Tiger01146_Hi0)
})
