package Tiger01445

import Tiger01445.buildTypes.*
import Tiger01445.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01445")
    name = "Tiger01445"

    vcsRoot(Tiger01445_cVCSroot)

    buildType(Tiger01445_Hi0)
    buildType(Tiger01445_Hi2)
    buildType(Tiger01445_Hi1)
    buildType(Tiger01445_Hi3)
})
