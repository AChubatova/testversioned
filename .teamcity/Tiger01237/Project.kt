package Tiger01237

import Tiger01237.buildTypes.*
import Tiger01237.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01237")
    name = "Tiger01237"

    vcsRoot(Tiger01237_cVCSroot)

    buildType(Tiger01237_Hi2)
    buildType(Tiger01237_Hi3)
    buildType(Tiger01237_Hi0)
    buildType(Tiger01237_Hi1)
})
