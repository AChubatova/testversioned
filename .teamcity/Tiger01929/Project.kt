package Tiger01929

import Tiger01929.buildTypes.*
import Tiger01929.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01929")
    name = "Tiger01929"

    vcsRoot(Tiger01929_cVCSroot)

    buildType(Tiger01929_Hi3)
    buildType(Tiger01929_Hi2)
    buildType(Tiger01929_Hi1)
    buildType(Tiger01929_Hi0)
})
