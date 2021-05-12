package Tiger01241

import Tiger01241.buildTypes.*
import Tiger01241.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01241")
    name = "Tiger01241"

    vcsRoot(Tiger01241_cVCSroot)

    buildType(Tiger01241_Hi0)
    buildType(Tiger01241_Hi2)
    buildType(Tiger01241_Hi1)
    buildType(Tiger01241_Hi3)
})
