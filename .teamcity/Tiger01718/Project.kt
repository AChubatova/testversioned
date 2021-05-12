package Tiger01718

import Tiger01718.buildTypes.*
import Tiger01718.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01718")
    name = "Tiger01718"

    vcsRoot(Tiger01718_cVCSroot)

    buildType(Tiger01718_Hi2)
    buildType(Tiger01718_Hi3)
    buildType(Tiger01718_Hi0)
    buildType(Tiger01718_Hi1)
})
