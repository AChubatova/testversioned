package Tiger01327

import Tiger01327.buildTypes.*
import Tiger01327.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01327")
    name = "Tiger01327"

    vcsRoot(Tiger01327_cVCSroot)

    buildType(Tiger01327_Hi2)
    buildType(Tiger01327_Hi3)
    buildType(Tiger01327_Hi0)
    buildType(Tiger01327_Hi1)
})
