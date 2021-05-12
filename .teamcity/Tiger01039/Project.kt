package Tiger01039

import Tiger01039.buildTypes.*
import Tiger01039.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01039")
    name = "Tiger01039"

    vcsRoot(Tiger01039_cVCSroot)

    buildType(Tiger01039_Hi2)
    buildType(Tiger01039_Hi3)
    buildType(Tiger01039_Hi0)
    buildType(Tiger01039_Hi1)
})
