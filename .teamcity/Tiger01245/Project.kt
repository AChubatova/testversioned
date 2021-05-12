package Tiger01245

import Tiger01245.buildTypes.*
import Tiger01245.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01245")
    name = "Tiger01245"

    vcsRoot(Tiger01245_cVCSroot)

    buildType(Tiger01245_Hi2)
    buildType(Tiger01245_Hi1)
    buildType(Tiger01245_Hi3)
    buildType(Tiger01245_Hi0)
})
