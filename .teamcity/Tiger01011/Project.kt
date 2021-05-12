package Tiger01011

import Tiger01011.buildTypes.*
import Tiger01011.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01011")
    name = "Tiger01011"

    vcsRoot(Tiger01011_cVCSroot)

    buildType(Tiger01011_Hi2)
    buildType(Tiger01011_Hi3)
    buildType(Tiger01011_Hi0)
    buildType(Tiger01011_Hi1)
})
