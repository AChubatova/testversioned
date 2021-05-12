package Tiger01749

import Tiger01749.buildTypes.*
import Tiger01749.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01749")
    name = "Tiger01749"

    vcsRoot(Tiger01749_cVCSroot)

    buildType(Tiger01749_Hi0)
    buildType(Tiger01749_Hi1)
    buildType(Tiger01749_Hi2)
    buildType(Tiger01749_Hi3)
})
