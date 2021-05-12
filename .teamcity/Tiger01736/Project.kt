package Tiger01736

import Tiger01736.buildTypes.*
import Tiger01736.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01736")
    name = "Tiger01736"

    vcsRoot(Tiger01736_cVCSroot)

    buildType(Tiger01736_Hi3)
    buildType(Tiger01736_Hi2)
    buildType(Tiger01736_Hi1)
    buildType(Tiger01736_Hi0)
})
