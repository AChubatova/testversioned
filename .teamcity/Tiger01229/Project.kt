package Tiger01229

import Tiger01229.buildTypes.*
import Tiger01229.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01229")
    name = "Tiger01229"

    vcsRoot(Tiger01229_cVCSroot)

    buildType(Tiger01229_Hi3)
    buildType(Tiger01229_Hi0)
    buildType(Tiger01229_Hi1)
    buildType(Tiger01229_Hi2)
})
