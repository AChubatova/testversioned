package Tiger01313

import Tiger01313.buildTypes.*
import Tiger01313.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01313")
    name = "Tiger01313"

    vcsRoot(Tiger01313_cVCSroot)

    buildType(Tiger01313_Hi0)
    buildType(Tiger01313_Hi1)
    buildType(Tiger01313_Hi2)
    buildType(Tiger01313_Hi3)
})
