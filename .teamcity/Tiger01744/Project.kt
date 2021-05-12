package Tiger01744

import Tiger01744.buildTypes.*
import Tiger01744.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01744")
    name = "Tiger01744"

    vcsRoot(Tiger01744_cVCSroot)

    buildType(Tiger01744_Hi0)
    buildType(Tiger01744_Hi3)
    buildType(Tiger01744_Hi1)
    buildType(Tiger01744_Hi2)
})
