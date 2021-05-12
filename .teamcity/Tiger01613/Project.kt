package Tiger01613

import Tiger01613.buildTypes.*
import Tiger01613.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01613")
    name = "Tiger01613"

    vcsRoot(Tiger01613_cVCSroot)

    buildType(Tiger01613_Hi3)
    buildType(Tiger01613_Hi2)
    buildType(Tiger01613_Hi1)
    buildType(Tiger01613_Hi0)
})
