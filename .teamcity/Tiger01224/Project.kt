package Tiger01224

import Tiger01224.buildTypes.*
import Tiger01224.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01224")
    name = "Tiger01224"

    vcsRoot(Tiger01224_cVCSroot)

    buildType(Tiger01224_Hi1)
    buildType(Tiger01224_Hi0)
    buildType(Tiger01224_Hi3)
    buildType(Tiger01224_Hi2)
})
