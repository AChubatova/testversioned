package Tiger01336

import Tiger01336.buildTypes.*
import Tiger01336.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01336")
    name = "Tiger01336"

    vcsRoot(Tiger01336_cVCSroot)

    buildType(Tiger01336_Hi0)
    buildType(Tiger01336_Hi1)
    buildType(Tiger01336_Hi2)
    buildType(Tiger01336_Hi3)
})
