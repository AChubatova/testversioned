package Tiger01832

import Tiger01832.buildTypes.*
import Tiger01832.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01832")
    name = "Tiger01832"

    vcsRoot(Tiger01832_cVCSroot)

    buildType(Tiger01832_Hi3)
    buildType(Tiger01832_Hi2)
    buildType(Tiger01832_Hi1)
    buildType(Tiger01832_Hi0)
})
