package Tiger01320

import Tiger01320.buildTypes.*
import Tiger01320.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01320")
    name = "Tiger01320"

    vcsRoot(Tiger01320_cVCSroot)

    buildType(Tiger01320_Hi2)
    buildType(Tiger01320_Hi1)
    buildType(Tiger01320_Hi0)
    buildType(Tiger01320_Hi3)
})
