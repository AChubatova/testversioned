package Tiger01517

import Tiger01517.buildTypes.*
import Tiger01517.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01517")
    name = "Tiger01517"

    vcsRoot(Tiger01517_cVCSroot)

    buildType(Tiger01517_Hi2)
    buildType(Tiger01517_Hi1)
    buildType(Tiger01517_Hi3)
    buildType(Tiger01517_Hi0)
})
