package Tiger01022

import Tiger01022.buildTypes.*
import Tiger01022.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01022")
    name = "Tiger01022"

    vcsRoot(Tiger01022_cVCSroot)

    buildType(Tiger01022_Hi0)
    buildType(Tiger01022_Hi1)
    buildType(Tiger01022_Hi2)
    buildType(Tiger01022_Hi3)
})
