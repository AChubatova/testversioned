package Tiger01043

import Tiger01043.buildTypes.*
import Tiger01043.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01043")
    name = "Tiger01043"

    vcsRoot(Tiger01043_cVCSroot)

    buildType(Tiger01043_Hi0)
    buildType(Tiger01043_Hi1)
    buildType(Tiger01043_Hi2)
    buildType(Tiger01043_Hi3)
})
