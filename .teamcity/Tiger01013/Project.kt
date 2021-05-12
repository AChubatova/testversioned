package Tiger01013

import Tiger01013.buildTypes.*
import Tiger01013.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01013")
    name = "Tiger01013"

    vcsRoot(Tiger01013_cVCSroot)

    buildType(Tiger01013_Hi2)
    buildType(Tiger01013_Hi3)
    buildType(Tiger01013_Hi0)
    buildType(Tiger01013_Hi1)
})
