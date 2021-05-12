package Tiger01825

import Tiger01825.buildTypes.*
import Tiger01825.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01825")
    name = "Tiger01825"

    vcsRoot(Tiger01825_cVCSroot)

    buildType(Tiger01825_Hi0)
    buildType(Tiger01825_Hi2)
    buildType(Tiger01825_Hi1)
    buildType(Tiger01825_Hi3)
})
