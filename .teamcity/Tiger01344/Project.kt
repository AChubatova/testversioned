package Tiger01344

import Tiger01344.buildTypes.*
import Tiger01344.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01344")
    name = "Tiger01344"

    vcsRoot(Tiger01344_cVCSroot)

    buildType(Tiger01344_Hi2)
    buildType(Tiger01344_Hi1)
    buildType(Tiger01344_Hi3)
    buildType(Tiger01344_Hi0)
})
