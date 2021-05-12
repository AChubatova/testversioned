package Tiger070

import Tiger070.buildTypes.*
import Tiger070.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger070")
    name = "Tiger070"

    vcsRoot(Tiger070_cVCSroot)

    buildType(Tiger070_Hi0)
    buildType(Tiger070_Hi1)
    buildType(Tiger070_Hi2)
    buildType(Tiger070_Hi3)
})
