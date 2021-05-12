package Tiger01319

import Tiger01319.buildTypes.*
import Tiger01319.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01319")
    name = "Tiger01319"

    vcsRoot(Tiger01319_cVCSroot)

    buildType(Tiger01319_Hi2)
    buildType(Tiger01319_Hi1)
    buildType(Tiger01319_Hi3)
    buildType(Tiger01319_Hi0)
})
