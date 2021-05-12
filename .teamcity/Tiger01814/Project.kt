package Tiger01814

import Tiger01814.buildTypes.*
import Tiger01814.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01814")
    name = "Tiger01814"

    vcsRoot(Tiger01814_cVCSroot)

    buildType(Tiger01814_Hi3)
    buildType(Tiger01814_Hi1)
    buildType(Tiger01814_Hi2)
    buildType(Tiger01814_Hi0)
})
