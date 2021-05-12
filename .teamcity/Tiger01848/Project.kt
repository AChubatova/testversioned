package Tiger01848

import Tiger01848.buildTypes.*
import Tiger01848.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01848")
    name = "Tiger01848"

    vcsRoot(Tiger01848_cVCSroot)

    buildType(Tiger01848_Hi1)
    buildType(Tiger01848_Hi0)
    buildType(Tiger01848_Hi3)
    buildType(Tiger01848_Hi2)
})
